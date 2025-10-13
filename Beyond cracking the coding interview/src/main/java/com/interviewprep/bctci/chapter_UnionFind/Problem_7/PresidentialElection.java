package com.interviewprep.bctci.chapter_UnionFind.Problem_7;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PresidentialElection {
    public static String findWinner(String[] candidates, int[] votes) {
        int totalVotes = Arrays.stream(votes).sum();
        PriorityQueue<Party> minHeap = new PriorityQueue<>();

        for (int i = 0; i < candidates.length; i++) {
            if (votes[i] > totalVotes / 2) {
                return candidates[i];
            }
            minHeap.add(new Party(candidates[i], votes[i]));
        }

        while (true) {
            Party leastVotesParty = minHeap.poll();
            Party secondLeastVotedParty = minHeap.poll();

            String coalitionLeader = secondLeastVotedParty.candidate;
            int coalitionVotes = leastVotesParty.votes + secondLeastVotedParty.votes;

            // in case of ties
            while (!minHeap.isEmpty() && secondLeastVotedParty.votes == minHeap.peek().votes) {
                coalitionLeader = minHeap.peek().candidate;
                coalitionVotes += minHeap.poll().votes;
            }

            if (coalitionVotes > totalVotes / 2) {
                return coalitionLeader;
            }

            minHeap.add(new Party(coalitionLeader, coalitionVotes));
        }
    }
}

@AllArgsConstructor
class Party implements Comparable<Party> {
    String candidate;
    int votes;

    @Override
    public int compareTo(Party other) {
        // compare based on number of votes (larger votes win), break ties based on the name (smaller name wins)
        return votes == other.votes ? other.candidate.compareTo(candidate) : Integer.compare(votes, other.votes);
    }
}
