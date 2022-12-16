package classesAndObjects;

public class SurfaceBundlesCharacteristics {

	public static void main(String[] args) {
		// Use the SurfaceBundles keyword to declare SurfaceBundles Class variable	
		
		SurfaceBundles SurfaceGo2 = new SurfaceBundles();
		SurfaceBundles SurfacePro7Plus = new SurfaceBundles();
		SurfaceBundles SurfaceBook = new SurfaceBundles();
		
		SurfaceGo2.dDisplay = 10.5;
		SurfaceGo2.iDiskSpace = 8;
		SurfaceGo2.iRam = 4;
		SurfaceGo2.fPrice = (float) 768.28;
		
		SurfacePro7Plus.dDisplay = 11.2;
		SurfacePro7Plus.iDiskSpace = 7;
		SurfacePro7Plus.iRam = 5;
		SurfacePro7Plus.fPrice = (float) 880.50;
		
		SurfaceBook.dDisplay = 11.5;
		SurfaceBook.iDiskSpace = 9;
		SurfaceBook.iRam = 6;
		SurfaceBook.fPrice = (float) 905.90;
		
		//Print Characteristics
		
		SurfaceGo2.DisplayCharacteristics();
		
		System.out.println("=========");
		
		SurfacePro7Plus.DisplayCharacteristics();
		
		System.out.println("=========");
		
		SurfaceBook.DisplayCharacteristics();
		
		
		
		
		
		

	}

}
