package Easy.ArraysAndHashing;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        StringBuilder out = new StringBuilder(magazine);
        StringBuilder in = new StringBuilder();

        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < out.length(); j++) {
                if (ransomNote.charAt(i) == out.charAt(j)) {
                    in.append(out.charAt(j));
                    out.deleteCharAt(j);
                    break;
                }
            }
        }

        return ransomNote.contentEquals(in);
    }
}
