```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
  // error: constructor MyClass needs to be defined
}
```