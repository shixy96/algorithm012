## Hash

拉链式解决哈希碰撞

```java
// HashMap putVal伪代码
final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
  if (empty(table)) {
    resize()
  }
  if (table[target] == null) {
    table[target] = newNode;
  } else {
    if (equals(oldKey, newKey) && equals(oldHash, newHash)) {
      newNode = oldNode
    } else if (oldNode is TreeNode) {
      newNode = putTreeVal()
    } else {
      if (cur.next == null) cur.next = newNode;/*treeify*/break;
      if (equals(oldKey, newKey) && equals(oldHash, newHash)) break;
      cur = cur.next;
    }
    updateValue(newNode)
  }
}
```



## Tree

> 前序：根-左-右
>
> 中序：左-根-右
>
> 后序：左-右-根

### 二叉搜索树

空树或者具有以下性质的二叉树

1. 左子树上所有节点的值均小于它的根节点的值
2. 右子树上所有节点的值均大于它的根节点的值
3. 以此类推，左、右子树也分别为二叉搜索树

中序遍历是升序遍历