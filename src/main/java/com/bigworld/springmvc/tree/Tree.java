package com.bigworld.springmvc.tree;

import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ywm
 * @date ：Created in 2020/8/7 15:25
 * @description：
 * @modified By：
 * @version: $
 */
public class Tree {
    private Node root;

    public Tree(Integer root) {
        this.root = new Node(root);
    }
public void retrive(){

}
    class Node{
      Integer data;
      Node left_child;
      Node right_child;

        public Node(Integer data) {
            this.data = data;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getLeft_child() {
            return left_child;
        }

        public void setLeft_child(Node left_child) {
            this.left_child = left_child;
        }

        public Node getRight_child() {
            return right_child;
        }

        public void setRight_child(Node right_child) {
            this.right_child = right_child;
        }
    }
}