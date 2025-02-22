## Border Layout
- Arranges the components into five regions, north, south, west, east and center
- North an south comonents occupy the whole width of container. 
- If north or south cmponents are missing east west and center components expand vertically to fill the space
- If west or east components are missing, center comonent expands horizontaly to fill the space
- If center component is missingm the sace is left blank.
- Its constructor are:
a. BorderLayout() -> no gap between components.
b. BorderLayout(int hor, int vert) -> Specified horz and cert gap between components.

If we need to place more than one component in any region of Border Layout. We must use a panel. 

Panel is a container like frame. However, it does not have title bar.

The default layout of frame is Border Layout. 

---

## Designing a frame without using Layout manager (Absolute Positioning):

- For this, we pass null to setLayout() method. 
Eg:
```java
JFrame jf = new JFrame();
jf.setLayout(null);
```
- Then, each component is added to the frame by specifying it X-coordinate, Y-Coordinate, Height, Width by using setBounds() methods.

---

## Event handling

It is the process of handling events where user interacts with UI components. For example: When user clicks a button. Event handling approach in java is based on event delegation model. 

### Event delegation model 

It is an approach in handling events whichs states that an event source generates event and notifies the event listener for further processing. It is based on the three concepts - **Event source, Event and Event Listener.**

1. **Event Source**: It is the component that generates event. It might be a *button, combo box, text field, etc.*
2. **Event**: It is an object that describes the state changed in event source. 
3. **Event Listener**: It is an object that runs in background and waits for an event to occur when event source notifies the listener about event occurance then listener does the further processing. 

Note: 
1. One event source may generate multiple events.
2. Multiple event source may generate one event. 
3. Each event source must be registered to the respective listener. 