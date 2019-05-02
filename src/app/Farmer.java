package app;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Farmer implements ICrosser {
	private double weight;
	private static final int eatingRank = 4;
	
	public static int getEatingrank() {
		return eatingRank;
	}



	public Farmer(double weight) {
		super();
		this.weight = weight;
	}



	@Override
	public boolean canSail() {
		return true;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public int getEatingRank() {
		return eatingRank;
	}

	@Override
	public BufferedImage[] getImages() {
		ClassLoader classLoader = getClass().getClassLoader();
		File[] f;
		f = new File[8];
		f[0] = new File(classLoader.getResource("Farmer.png").getFile());
		BufferedImage[] image = new BufferedImage[8];
		image[0] = new BufferedImage(226, 247, BufferedImage.TYPE_INT_ARGB);
		try {
			image[0] = ImageIO.read(f[0]);
			System.out.println("loaded mans");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public ICrosser makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLabelToBeShown(String label) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLabelToBeShown() {
		// TODO Auto-generated method stub
		return null;
	}

}
