package Renderer3D;

import DwarfEngine.MathTypes.Vector2;
import DwarfEngine.MathTypes.Vector3;

public final class Mesh {
	private Vector3[] vertices;
	private Vector2[] uv;
	private int[] triangles;
	
	public void setVertices(Vector3[] vertices) {
		this.vertices = vertices;
	}
	public Vector3[] getVetices() {
		return vertices;
	}
	public int vertexCount() {
		return vertices.length;
	}
	
	public void setTriangles(int[] triangles) {
		if (triangles.length % 3 != 0) {
			throw new IllegalArgumentException("Triangles size must be divisible by 3!");
		}
		this.triangles = triangles;
	}
	public int[] getTriangles() {
		return triangles;
	}
	public int triangleCount() {
		return triangles.length;
	}
	
	public void setUV(Vector2[] uvs) {
		if (uvs.length != vertices.length) {
			throw new IllegalArgumentException("uvs must be the same size as vertices");
		}
		this.uv = uvs;
	}
	public Vector2[] getUV() {
		return uv;
	}
	public int getUVCount() {
		return uv.length;
	}
	
	public static Mesh MakeCube() {
		Mesh cube = new Mesh();
		cube.vertices = new Vector3[] {
				// front
	        	new Vector3(-.5f, -.5f, -.5f),
	        	new Vector3(-.5f, .5f, -.5f),
	        	new Vector3(.5f, .5f, -.5f),
	        	new Vector3(.5f, .5f, -.5f),
	        	new Vector3(.5f, -.5f, -.5f),
	        	new Vector3(-.5f, -.5f, -.5f),
	        	
	        	//// back
	        	new Vector3(-.5f, -.5f, .5f),
	        	new Vector3(-.5f, .5f, .5f),
	        	new Vector3(.5f, .5f, .5f),
	        	new Vector3(.5f, .5f, .5f),
	        	new Vector3(.5f, -.5f, .5f),
	        	new Vector3(-.5f, -.5f, .5f),
	        	
	        	//right
	        	new Vector3(.5f, -.5f, -.5f),
	        	new Vector3(.5f, .5f, -.5f),
	        	new Vector3(.5f, .5f, .5f),
	        	new Vector3(.5f, .5f, .5f),
	        	new Vector3(.5f, -.5f, .5f),
	        	new Vector3(.5f, -.5f, -.5f),
	        	
	        	//left
	        	new Vector3(-.5f, -.5f, -.5f),
	        	new Vector3(-.5f, .5f, -.5f),
	        	new Vector3(-.5f, .5f, .5f),
	        	new Vector3(-.5f, .5f, .5f),
	        	new Vector3(-.5f, -.5f, .5f),
	        	new Vector3(-.5f, -.5f, -.5f),
	        	
				// bottom
				new Vector3(-.5f, -.5f, -.5f),
				new Vector3(-.5f, -.5f, .5f),
				new Vector3(.5f, -.5f, .5f),
				new Vector3(.5f, -.5f, .5f),
				new Vector3(.5f, -.5f, -.5f),
				new Vector3(-.5f, -.5f, -.5f),
				
				//top
				new Vector3(-.5f, .5f, -.5f),
				new Vector3(-.5f, .5f, .5f),
				new Vector3(.5f, .5f, .5f),
				new Vector3(.5f, .5f, .5f),
				new Vector3(.5f, .5f, -.5f),
				new Vector3(-.5f, .5f, -.5f),
		};
		cube.triangles = new int[] {
	        	0, 1, 2, 
	        	3, 4, 5, 
	        	6, 10, 8,
	        	9, 7, 11, 
	        	12, 13, 14, 
	        	15, 16, 17, 
	        	18, 22, 20, 
	        	21, 19, 23, 
	        	24, 28, 26,
	        	27, 25, 29, 
	        	30, 31, 32, 
	        	33, 34, 35
		};
		return cube;
	}
	
	public static Mesh MakeQuad() {
		Mesh quad = new Mesh();
		
		quad.vertices = new Vector3[] {
				new Vector3(-0.5f, -0.5f, 0),
				new Vector3(0.5f, -0.5f, 0),
				new Vector3(-0.5f, 0.5f, 0),
				new Vector3(0.5f, 0.5f, 0),				
		};
		quad.triangles = new int[] {
				0, 2, 3,
				3, 1, 0
		};
		quad.uv = new Vector2[] {
				new Vector2(0, 0),
				new Vector2(1, 0),
				new Vector2(0, 1),
				new Vector2(1, 1),
		};
		
		return quad;
	}
	
}
