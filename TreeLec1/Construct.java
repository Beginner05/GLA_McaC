package TreeLec1;

import java.util.*;

public class Construct {

	class node {
		int val;
		node left;
		node right = null;
	}

	private node root = null;
	Scanner scn;

	public Construct(String str) {
		scn = new Scanner(str);
		root = construct(null, false);
	}

	public node construct(node root, boolean lc) {

		if (root == null) {
			System.out.println("enter the value for root node");

		} else {
			if (lc == true) {
				System.out.println("enter the value for left child of " + root.val);
			} else {
				System.out.println("enter the value for right child of " + root.val);
			}
		}
		node nn = new node();
		nn.val = scn.nextInt();
		System.out.println(nn.val + " has left child ?");
		boolean hlc = scn.nextBoolean();
		if (hlc == true) {
			nn.left = construct(nn, true);
		}
		System.out.println(nn.val + " has right child?");
		boolean hrc = scn.nextBoolean();
		if (hrc == true) {
			nn.right = construct(nn, false);
		}

		return nn;

	}
public void display()
{
	display(root);
}
	public void display(node root) {
		if(root==null)return;
		String ans = "";
		if (root.left != null) {
			ans += root.left.val + " <- " + root.val + " -> ";

		} else {
			ans += "." + " <- " + root.val + " -> ";
		}
		if (root.right != null) {
			ans += root.right.val;
		} else {
			ans += ".";
		}
		System.out.println(ans);
		display(root.left);
		display(root.right);

	}
	public int size()
	{
		return size(root);
	}
public int size(node root)
{
	if(root==null)return 0;
	int left=size(root.left);
	int right=size(root.right);
	return left+right+1;
}
	public int height()
	{
		return height(root);
	}
	public int height(node root)
	{
		if(root==null)return -1;
		int left=height(root.left);
		int right=height(root.right);
		return Math.max(left,right)+1;
	}
	public boolean find(int trgt)
	{
		return find(root,trgt);
	}
	public boolean find(node root,int trgt)
	{
		if(root==null)return false;
		if(root.val==trgt)return true;
		boolean left=find(root.left,trgt);
		if(left==true)return true;
		boolean right=find(root.right,trgt);
		return left||right;
	}
	public int findMax()
	{
		return findMax(root);
	}
	public int findMax(node root)
	{
		if(root==null)return 0;
		int left=findMax(root.left);
		int right=findMax(root.right);
		return Math.max(left,Math.max(right,root.val));
	}
}
