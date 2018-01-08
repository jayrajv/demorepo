package com.example.demo.criteria;

import java.util.Collection;

import com.example.demo.entity.ApplicationVO;

public class Utils {

	public Utils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printApps(Collection<ApplicationVO> apps, String method)
	{
		System.out.println("Inside Utils, Calling#"+method);
		if (apps != null) {
			for (ApplicationVO app : apps) {
				System.out.println("AppID#" + app.getAppId() + "#Type#" + app.getAppType() + "#Locality#"
						+ app.getLocation().getLocality() + "#City#" + app.getLocation().getCity() + "#Longi/Lati#"
						+ app.getLocation().getGeoPoint().getX() + "," + app.getLocation().getGeoPoint().getY());

			}
		}

	}

}
