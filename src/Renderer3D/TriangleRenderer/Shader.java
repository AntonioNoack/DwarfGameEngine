package Renderer3D.TriangleRenderer;

import java.awt.Color;

public interface Shader {
	public Color Fragment(Vertex scanStart, Vertex scanEnd, float xi);
}
