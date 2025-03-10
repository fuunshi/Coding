## Listener and its abstract methods


**Mouse Event**: Occurs when a mouse enters/exits/pressed/released/clicked on a componenet

**Mouse Listener**

```java
public void mouseEntered(MouseEvent e)
public void mouseExited(MouseEvent e)
public void mousePressed(MouseEvent e)
public void mouseReleased(MouseEvent e)
public void mouseClicked(MouseEvent e)
```

**Adapter Class**: MouseAdapter

**Key Listener**

```java
public void keyReleased(KeyEvent e)
public void keyPressed(KeyEvent e)
public void keyTyped(KeyEvent e)
```

**Mouse Motion Event**: Occurs when a mouse is moved or dragged on a component

```java
public void mousedMoved(MouseMotionEvent e)
public void mousedDragged(MouseMotionEvent e)
```

**Adapter Class**: MouseMotionAdapter

**Component Event**: Occurs when a component is shown/hidden/moved/resized

**Component Listener**
```java
public void componentShown(ComponentEvent e)
public void componentHidden(ComponentEvent e)
public void componentMoved(ComponentEvent e)
public void componentResized(ComponentEvent e)
```

**Adapter Class**: ComponentAdapter

**Event Class**

**Container Event**: occurs when a component is aded to or removed rom a container.

**Container Listener**:
```java
public void componentAdded(ContainerEvent e)
public void componentRemoved(ContainerEvent e)
```

**Adapter Class**: ContainerAdapter

**WindowEvent**: occurs when a window is opened, closed, activated, deactivated, iconified, deiconified

**WindowListener**:
```java
public void windowOpened(WindowEvent e)
public void windowClosed(WindowEvent e)
public void windowClosing(WindowEvent e)
public void windowActivated(WindowEvent e)
public void windowDeactivated(WindowEvent e)
public void windowIconified(WindowEvent e)
public void windowDeiconified(WindowEvent e)
```

**Window Adapter**: WindowAdapter

**TextEvent**: occurs when text in textfield/textarea is changed

**TextListener**:
```java
public void textValueChanged(TextEvent e)
```

**ListSelectionEvent**:
occurs when item in a JList is selected

**ListSelectorListener**:
```java
public void valueChanged(ListSelectionEvent e)
```

**Notes**: This selection listener and event are defined under `javax.swing.event` package.

---

1. Built-in/ Library Dialog Box

THese are already available in java.
Examples:
- MEssage Dialog
- Input DIalog
- Confirm Dialog
- Color Dialog -> JColorCHoose class is used
- FIle Dialog -> JFileChooser class is used

2. User defined/ Custom Dialog box
- Created according to the requirement of user
- JDialog class is used
- Its constructs are:-
    - JDialog(JFrame parent)
    - JDialog(Jframe parent, boolean isModel)
    - JDialog(JFrame parent, String title, boolean isModel)

**Note**: IF "isModel" is set false, then we can access the parent application without closing the JDialog.
Default Layout of JDialog is BorderLayout.

## Toggle BUtton

- It is a special type of button that has two distinct states "pressed" ON and "released" OFF. It can be used as a switch
- JToggleButton class is used
- Both ActionEvent and ItemEvent occur when it is clicked
- isSelected() method returns trye if it is selected(ON) otherwise returns false.
---

|  JComboBox  | JLIst   |
|-------------|---------|
|It is used to create a drop down of list| It is used to create a list of box|
|Only 1 item can be selected. | Multiple items can be selected|
|Scrollbar is automatically added|Scroll bar should be added manually using JScrollPane class|
| void setMaximumRowCount(int) method is used to set the number of visible items at a time| void setVIsibleROwCOunt(int) method is used to set the number of items visible at a time|
|BOth ActionEvent and ItemEvent occur whena list item is selected | LIstSelectionEvent occurs when the list item is selcted.|

---

**Notes:**
1. Items can be added to JList and JCOmboBOx by passing an array in their constructor or by using arrayaddItem() method.
2. The selection mode of JList can be controlled by setSelectionMode() method which takes one of these 3 arguments: ListSelectionModel.SINGLE_SELECTION, ListSelectionModel.SINGLE_INTERVAL_SELECTION and ListSelectionModel.MULTIPLE_INTERVAL_SELECTION