package tree;

import java.util.ArrayList;
import java.util.List;

public class N_113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> all = new ArrayList<>();
        ArrayList<Integer> single = new ArrayList<>();
        traverse(root,targetSum,single,all);
        return all;
    }

    public void traverse (TreeNode root, int count, ArrayList<Integer> single, List<List<Integer>> all) {
        single.add(root.val);
        count -= root.val;
        //System.out.println(count);
        if (root.left == null && root.right == null && count == 0) {
            all.add(new ArrayList<>(single));
        }

        if (root.left != null) {
            traverse(root.left, count, single, all);
            //count += root.left.val;
            single.remove(single.size() - 1);
            System.out.println(count);

        }
        if (root.right != null) {
            traverse(root.right, count, single, all);
            single.remove(single.size() - 1);
            //count += root.right.val;
        }
    }

    public static void main(String[] args) {
        N_113 test = new N_113();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);

        t1.left = t2;
        t1.right = t3;
//        System.out.println(test.pathSum(t1,5));

            String name = "Scott";
            int age = 5;
            User user = new User();
            user.setName(name);
            user.setAge(age);
            System.out.println("before change user = " + user);

            change(user, name, age);
            System.out.println("name = " + name);
            System.out.println("age = " + age);
            System.out.println("after change user = " + user);
        }

        public static void change(User user, String name, int age) {
//            name = "Tom";
//            age = 20;
//            user.setName(name);
//            user.setAge(age);
            user = new User("dd",1);
        }

        static class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public User() {

            }


            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public int getAge() {
                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }
            @Override
            public String toString() {
                return "{name : " + name + ", age : " + age + "}";
            }
        }

}
