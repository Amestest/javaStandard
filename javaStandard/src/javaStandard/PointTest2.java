package javaStandard;

class PointTest2 {
	public static void main(String args[]) {
		Points3D p3 = new Points3D();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point3 {
	int x =10;
	int y =20;
	
	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Points3D extends Point3 {
	int z = 30;
	
	Points3D() {
		this(100, 200, 300); // Point3D(int x, int y, int z)를 호출한다.
	}
	Points3D(int x, int y, int z) {
		super(x, y); // Point3D(int x, int y)를 호출한다.
		this.z = z;
	}
}