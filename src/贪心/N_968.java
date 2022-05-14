package ̰��;

import tree.TreeNode;

public class N_968 {
    int result = 0;
    public int minCameraCover(TreeNode root) {
        if(traversal(root) == 0){
            result++;
        }
        return result;
    }

    private int traversal (TreeNode root){
        // 0���ýڵ�δ���ǣ�
        // 1���ýڵ㱻���ǣ�
        // 2���ýڵ�������ͷ
        if(root == null){
            //����ǿսڵ㣬�����Ϊ����״̬
            return 1;
        }
        int left = traversal(root.left);
        int right = traversal(root.right);
        if(left == 0 || right == 0){
            // ������ҽڵ���һ��û���ǣ����ڵ�Ӧ��������ͷ
            result++;
            return 2;
        }
        if(left == 1 && right == 1){
            // ������ҽڵ㶼�����ǣ����ڵ�Ӧ����δ����״̬
            return 0;
        }
//        if(left == 2 || right == 2){
            // ������ҽڵ���һ��������ͷ�����ڵ�Ӧ���Ǹ���״̬
            return 1;
//        }
//        return result;
    }
}
