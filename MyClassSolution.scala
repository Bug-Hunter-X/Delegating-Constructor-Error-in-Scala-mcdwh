```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
  // No longer need an explicit constructor definition
}
```