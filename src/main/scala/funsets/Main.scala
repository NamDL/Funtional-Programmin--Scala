package funsets

object Main extends App {
  import FunSets._
  //println(singletonSet(3))
  //println(contains(singletonSet(2), 1))
  var s1=singletonSet(1);
  var s2=singletonSet(2);
  var s3=singletonSet(3);
  var s4=singletonSet(4);
  var s5=union(s1,s2)
  var s6=union(s3,s4)
  var s=union(s5,s6)
  println(forall(s,x=>x>0))
  printSet(filter(s,x=>x>=3))
}
