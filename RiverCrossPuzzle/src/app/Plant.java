package app;

import java.awt.image.BufferedImage;

public class Plant implements ICrosser {

	private double weight;
	public static final int eatingRank = 0;
	@Override
	public boolean canSail() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public int getEatingRank() {
		// TODO Auto-generated method stub
		return eatingRank;
	}

	@Override
	public BufferedImage[] getImages() {
		// TODO Auto-generated method stub
		return null;
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
