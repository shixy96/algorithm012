### 递归

```java
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```



### 分治

>  找重复性

```js
function divideConquer(problem, params) {
	// recursion terminator
	if (...) return;
  
  // prepare data and split problem
	split();
  
  // conquer subproblems
  subresult1 = divideConquer(subproblem1, params);
  subresult2 = divideConquer(subproblem2, params);
  ...
  result = processResult(subresult1, subresult2, ...);

	clean;

}
```

