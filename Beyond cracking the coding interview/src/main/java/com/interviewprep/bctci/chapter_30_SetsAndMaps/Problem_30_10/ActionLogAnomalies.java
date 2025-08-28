package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_10;

import java.util.*;

public class ActionLogAnomalies {
    public static Integer[] findAnomalies(LogEntry[] entries) {
        Set<Integer> anomalies = new HashSet<>();

        Set<Integer> completedTickets = new HashSet<>();
        Map<Integer, String> openedTicketToAgentMapping = new HashMap<>();
        Map<String, Integer> agentToTicketMapping = new HashMap<>();

        for (LogEntry entry : entries) {
            int ticketNumber = entry.ticketNumber();
            String agent = entry.agent();
            Action action = entry.action();

            // If the ticket is already considered an anomaly, any action would be suspicious
            if (anomalies.contains(ticketNumber)) {
                continue;
            }
            // if the ticket has already been marked completed, any action on it would make it an anomaly
            if (completedTickets.contains(ticketNumber)) {
                anomalies.add(ticketNumber);
                continue;
            }
            // agent has been working on some other ticket, the other ticket is an anomaly
            if (agentToTicketMapping.containsKey(agent) && agentToTicketMapping.get(agent) != ticketNumber) {
                anomalies.add(agentToTicketMapping.get(agent));
            }

            if (action == Action.OPEN) {
                // If the is ticket opened again
                if (openedTicketToAgentMapping.containsKey(ticketNumber)) {
                    anomalies.add(ticketNumber);
                } else {
                    agentToTicketMapping.put(agent, ticketNumber);
                    openedTicketToAgentMapping.put(ticketNumber, agent);
                }
            } else {
                String workingAgent = openedTicketToAgentMapping.getOrDefault(ticketNumber, "");

                // closed before opening OR closed by a different agent
                if (workingAgent.isEmpty() || !Objects.equals(workingAgent, agent)) {
                    anomalies.add(ticketNumber);
                }

                completedTickets.add(ticketNumber);
                openedTicketToAgentMapping.remove(ticketNumber);
                agentToTicketMapping.remove(agent);
            }
        }

        anomalies.addAll(openedTicketToAgentMapping.keySet());

        return anomalies.toArray(new Integer[0]);
    }

}
