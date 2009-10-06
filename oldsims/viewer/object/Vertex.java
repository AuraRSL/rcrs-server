package viewer.object;

import java.util.*;
import rescuecore.RescueConstants;

public abstract class Vertex extends PointObject {
  public Vertex(int id) { super(id); }

  private int[] m_edges;
  private HashSet m_edgeSet = null;

  public HashSet edges() {
    if (m_edgeSet != null)
      return m_edgeSet;
    m_edgeSet = new HashSet(m_edges.length, 1);
    for (int i = 0;  i < m_edges.length;  i ++)
      m_edgeSet.add(WORLD.get(m_edges[i]));
    m_edges = null;
    return m_edgeSet;
  }

  public void setEdges(int[] value) {
    if (m_edgeSet == null  &&  m_edges == null)
      m_edges = value;
  }

  public void input(int property, int[] value) {
    switch(property) {
    default: super.input(property, value); break;
    case RescueConstants.PROPERTY_EDGES: setEdges(value);  break;
    }
  }

  public boolean isAdjacentTo(MotionlessObject obj)
    { return edges().contains(obj); }

  public HashSet links() { return edges(); }
}