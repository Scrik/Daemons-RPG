package ru.tec.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author White2Demon	
 *
 */
public class Config {
	
	// Constants
	
	public static int countFaction; // ��������� �������� �����
	public static int cessFaction; // ����� �����
	
	/**
	 * �������� ������� �� �����
	 */
	public static void load()
	{
		FileInputStream fis;
        Properties property = new Properties();
 
        try {
            fis = new FileInputStream("rpg.properties");
            property.load(fis);
 
            String countFaction = property.getProperty("faction.count");
            String cessFaction = property.getProperty("faction.cess");
            
            Config.cessFaction = Integer.parseInt(cessFaction);
            Config.countFaction = Integer.parseInt(countFaction);
 
        } catch (IOException e) {
            System.err.println("������: ���� ������� ����������!");
        }
	}
	
}
