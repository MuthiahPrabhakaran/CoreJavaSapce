# CoreJavaSapce
(My exercises on core Java)

## Memory - Management
### Escaping reference

What is escaping reference?
<br>
When we send some data through bean getters, it should send the data alone, not the reference. By all means, the receiver should not be allowed to change the state of the original object.
<br>
<b>simply, the values from bean getters should be read only values</b>


