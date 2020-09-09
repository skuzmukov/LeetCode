package strings.Task_165;

//https://leetcode.com/problems/compare-version-numbers/
class Solution {
    public int compareVersion(String version1, String version2) {

        if (version1.length() >= version2.length()) {
            return compare(version1, version2);
        } else {
            return -1 * compare(version2, version1);
        }
    }

    private int compare(String ver1, String ver2) {
        String[] v1 = ver1.split("\\.");
        String[] v2 = ver2.split("\\.");

        int v_1;
        int v_2;

        for (int i = 0; i < v1.length; i++) {
            v_2 = i >= v2.length ? 0 : Integer.parseInt(v2[i]);
            v_1 = Integer.parseInt(v1[i]);

            if (v_1 == v_2) { continue; }

            return v_1 > v_2 ? 1 : -1;
        }

        return 0;
    }
}