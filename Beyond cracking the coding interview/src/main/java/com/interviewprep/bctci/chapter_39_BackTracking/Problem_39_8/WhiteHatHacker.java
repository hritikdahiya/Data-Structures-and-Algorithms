package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_8;

import java.util.HashSet;
import java.util.Set;

public class WhiteHatHacker {
    private static final char[] CHAR_SET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static String getPassword(CryptoAPI cryptoAPI) {
        StringBuilder interimPassword = new StringBuilder();
        Set<Character> usedCharacter = new HashSet<>();

        return getPasswordHelper(interimPassword, 10, usedCharacter, cryptoAPI);
    }

    private static String getPasswordHelper(StringBuilder workingPassword, int maxLen, Set<Character> usedCharacter, CryptoAPI cryptoAPI) {
        if (workingPassword.length() > maxLen) {
            return null;
        }
        if (cryptoAPI.checkPassword(workingPassword.toString())) {
            return workingPassword.toString();
        }

        for (char ch : CHAR_SET) {
            if (usedCharacter.contains(ch)) {
                continue;
            }

            usedCharacter.add(ch);
            workingPassword.append(ch);

            String result = getPasswordHelper(workingPassword, maxLen, usedCharacter, cryptoAPI);
            if (result != null) {
                return result;
            }

            usedCharacter.remove(ch);
            workingPassword.deleteCharAt(workingPassword.length() - 1);
        }

        return null;
    }
}
