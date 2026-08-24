/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer str = new StringBuffer();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node==null) {
                  str.append("null"+",");
                  continue;  
                }
                 str.append(node.val + ",");
               if(node!=null) queue.offer(node.left);
               if(node!=null) queue.offer(node.right);
            }
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;

      String[] str = data.split(",");
      if(str[0].equals("null")) return null;
     Queue<TreeNode> queue = new LinkedList<>();
     int i = 0;
     TreeNode node = new TreeNode(Integer.parseInt(str[i]));
     queue.add(node);
     i++;
     while(!queue.isEmpty()){
        TreeNode current = queue.poll();
        if(!str[i].equals("null")) {
            current.left = new TreeNode(Integer.parseInt(str[i]));
            queue.offer(current.left);
        }
        i++;
         if(!str[i].equals("null")) {
            current.right = new TreeNode(Integer.parseInt(str[i]));
            queue.offer(current.right);
        }
        i++;
     }
     return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));