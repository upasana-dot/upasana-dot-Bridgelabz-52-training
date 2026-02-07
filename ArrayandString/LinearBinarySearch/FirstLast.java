package ArrayandString.LinearBinarySearch;

public class FirstLast {
    static int first(int[] a, int x) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] >= x) r = m - 1;
            else l = m + 1;
            if (a[m] == x) ans = m;
        }
        return ans;
    }

    static int last(int[] a, int x) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] <= x) l = m + 1;
            else r = m - 1;
            if (a[m] == x) ans = m;
        }
        return ans;
    }
}
