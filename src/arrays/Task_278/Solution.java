package arrays.Task_278;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int h = 1;
        int t = n;
        int m;
        boolean currVersion;
        while (h <= t) {
            m = (h + t) >> 1;
            currVersion = isBadVersion(m);
            if (currVersion && (m == 1 || m > 1 && !isBadVersion(m - 1))) {
                return m;
            } else if (currVersion) {
                t = m - 1;
            } else {
                h = m + 1;
            }
        }
        return -1;
    }

    public int firstBadVersion1(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}

class VersionControl {
    public boolean isBadVersion(int version) {
        return true;
    }
}
