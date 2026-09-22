class Solution {

    static class Node {
        int prod;
        int[] cnt;

        Node(int k) {
            cnt = new int[k];
        }
    }

    int n;
    int k;
    int[] nums;
    Node[] tree;

    public int[] resultArray(int[] nums, int k, int[][] queries) {

        this.n = nums.length;
        this.k = k;
        this.nums = nums;

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            // Update
            nums[index] = value;
            update(1, 0, n - 1, index, value);

            // Query [start, n-1]
            Node res = query(
                1, 0, n - 1,
                start, n - 1
            );

            ans[i] = res.cnt[x];
        }

        return ans;
    }

    // =========================
    // BUILD
    // =========================

    void build(int node, int l, int r) {

        if (l == r) {

            tree[node] = new Node(k);

            int rem = nums[l] % k;

            tree[node].prod = rem;
            tree[node].cnt[rem] = 1;

            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        tree[node] = merge(
            tree[node * 2],
            tree[node * 2 + 1]
        );
    }

    // =========================
    // UPDATE
    // =========================

    void update(
        int node,
        int l,
        int r,
        int index,
        int value
    ) {

        if (l == r) {

            tree[node] = new Node(k);

            int rem = value % k;

            tree[node].prod = rem;
            tree[node].cnt[rem] = 1;

            return;
        }

        int mid = (l + r) / 2;

        if (index <= mid) {

            update(
                node * 2,
                l,
                mid,
                index,
                value
            );

        } else {

            update(
                node * 2 + 1,
                mid + 1,
                r,
                index,
                value
            );
        }

        tree[node] = merge(
            tree[node * 2],
            tree[node * 2 + 1]
        );
    }

    // =========================
    // QUERY
    // =========================

    Node query(
        int node,
        int l,
        int r,
        int ql,
        int qr
    ) {

        if (ql <= l && r <= qr) {
            return tree[node];
        }

        int mid = (l + r) / 2;

        if (qr <= mid) {

            return query(
                node * 2,
                l,
                mid,
                ql,
                qr
            );
        }

        if (ql > mid) {

            return query(
                node * 2 + 1,
                mid + 1,
                r,
                ql,
                qr
            );
        }

        Node left = query(
            node * 2,
            l,
            mid,
            ql,
            qr
        );

        Node right = query(
            node * 2 + 1,
            mid + 1,
            r,
            ql,
            qr
        );

        return merge(left, right);
    }

    // =========================
    // MERGE
    // =========================

    Node merge(Node left, Node right) {

        Node parent = new Node(k);

        // Product of the complete segment
        parent.prod =
            (left.prod * right.prod) % k;

        // --------------------------------
        // Prefixes completely inside LEFT
        // --------------------------------

        for (int rem = 0; rem < k; rem++) {

            parent.cnt[rem] += left.cnt[rem];
        }

        // --------------------------------
        // Prefixes crossing LEFT + RIGHT
        //
        // IMPORTANT:
        // The entire LEFT must be included.
        // --------------------------------

        for (int rem = 0; rem < k; rem++) {

            int newRem =
                (left.prod * rem) % k;

            parent.cnt[newRem] += right.cnt[rem];
        }

        return parent;
    }
}