package com.antoinedev.Exercice3;

public class Position {
    public final static int NORD=1;
    public final static int EST=2;
    public final static int SUD=3;
    public final static int OUEST=4;

    private int x;
    private int y;
    private int orientation;
	
	public Position(){
		 x=0;
		 y=0;
		 orientation=NORD;
	}
	public void avancer(int distance)
	 { 		       
		switch (orientation) {
			case NORD: y+=distance; break;
			case EST: x+=distance; break;
			case SUD: y-=distance; break;
			case OUEST: x-=distance; break;
		}
      }
	public void reculer(int distance)
	 { 		       
		switch (orientation) {
			case NORD: y-=distance; break;
			case EST: x-=distance; break;
			case SUD: y+=distance; break;
			case OUEST: x+=distance; break;
		}
     }
	public void tournerDroite()
	{
		//tourner de 45� vers la droite
		switch (orientation) {
			case NORD: orientation=EST; break;
			case EST: orientation=SUD; break;
			case SUD: orientation=OUEST; break;
			case OUEST: orientation=NORD; break;
		}
    }
	public void tournerGauche()
	{
		//tourner de 45� vers la gauche
		switch (orientation) {
			case NORD: orientation=OUEST; break;
			case EST: orientation=NORD; break;
			case SUD: orientation=EST; break;
			case OUEST: orientation=SUD; break;
		}
    }
    private String chaineOrientation(){
		switch (orientation) {
			case NORD: return "NORD";
			case EST: return "EST";
			case SUD: return "SUD";
			case OUEST: return "OUEST";
			default: return "orientation inconnue";
		}
    }
 	public String toString(){
		return "("+x+","+y +", "+chaineOrientation()+")";
	}

}
