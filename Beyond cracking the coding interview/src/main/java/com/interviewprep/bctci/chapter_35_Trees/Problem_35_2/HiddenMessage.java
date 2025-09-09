package com.interviewprep.bctci.chapter_35_Trees.Problem_35_2;

import com.interviewprep.bctci.chapter_35_Trees.Node;

public class HiddenMessage {
    public static String decrypt(Node<String> root) {
        StringBuilder stringBuilder = new StringBuilder();

        decryptHelper(root, stringBuilder);

        return stringBuilder.toString();
    }

    private static void decryptHelper(Node<String> root, StringBuilder stringBuilder) {
        if (root == null) {
            return;
        }

        char traversalIdentifier = root.val.charAt(0);
        if (traversalIdentifier == 'a') {
            stringBuilder.append(decrypt(root.left))
                         .append(decrypt(root.right))
                         .append(root.val.charAt(1));
        } else if (traversalIdentifier == 'b') {
            stringBuilder.append(root.val.charAt(1))
                         .append(decrypt(root.left))
                         .append(decrypt(root.right));
        } else {
            stringBuilder.append(decrypt(root.left))
                         .append(root.val.charAt(1))
                         .append(decrypt(root.right));
        }
    }
}
