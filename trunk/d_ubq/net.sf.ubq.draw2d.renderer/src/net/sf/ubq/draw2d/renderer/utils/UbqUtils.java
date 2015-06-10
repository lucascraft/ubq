/***********************************************************************************
 * Ubiquisense - A ubiquitous computing utilities framework 
 * 
 * Copyright (c) 2014, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.ubq.draw2d.renderer.utils;

import java.util.TreeMap;

import net.sf.smbt.ubqt.UbqColor;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import com.sun.media.sound.InvalidDataException;

public class UbqUtils {

		public final static UbqUtils INSTANCE = new UbqUtils();
		
		public static final String[] Colors = new String[]{
			"Red",
			"Green",
			"Blue",
			"Aquamarine",
			"Baker's Chocolate",
			"Black",
			"Blue",
			"Brass",
			"Bright Gold",
			"Brown",
			"Bronze",
			"Gold",
			"Grey",
			"Green",
			"Copper",
			"Coral",
			"Cyan",
			"Dark Green",
			"Green Yellow",
			"Magenta",
			"Maroon",
			"Medium Blue",
			"Sienna",
			"Silver",
			"Salmon",
			"Orange",
			"Pink",
			"Red",
			"Summer Sky",
			"Tan",
			"Thistle",
			"Turquoise",
			"Very Dark Brown",
			"Very Light Grey",
			"Violet",
			"Violet Red",
			"Wheat",
			"White",
			"Yellow",
			"Yellow Green",
			"Dark Yellow",
			"Bronze II",
			"Cadet Blue",
		    "Cool Copper",
			"Corn Flower Blue",
			"Dark Brown",
			"Dark Green Copper",
			"Dark Olive Green",
			"Dark Orchid",
			"Dark Purple",
			"Dark Slate Blue",
			"Dark Slate Grey",
			"Dark Tan",
			"Dark Turquoise",
			"Dark Wood",
			"Dim Grey",
			"Dusty Rose",
			"Feldspar",
			"Firebrick",
			"Forest Green",
			"Goldenrod",
			"Green Copper",
			"Hunter Green",
			"Indian Red",
			"Khaki",
			"Light Blue",
			"Light Grey",
			"Light Steel Blue",
			"Light Wood",
			"Lime Green",
			"Mandarian Orange",
			"Medium Aquamarine",
			"Medium Forest Green",
			"Medium Goldenrod",
			"Medium Orchid",
			"Medium Sea Green",
			"Medium Slate Blue",
			"Medium Spring Green",
			"Medium Turquoise",
			"Medium Violet Red",
			"Medium Wood",
			"Midnight Blue",
			"Navy Blue",
			"Neon Blue",
			"Neon Pink",
			"New Midnight Blue",
			"New Tan",
			"Old Gold",
			"Orange Red",
			"Orchid",
			"Pale Green",
			"Plum",
			"Quartz",
			"Rich Blue",
			"Scarlet",
			"Sea Green",
			"Semi-Sweet Chocolate",
			"Sky Blue",
			"Slate Blue",
			"Spicy Pink",
			"Spring Green",
			"Steel Blue"
		};
		
		java.util.Map<String, Color> colorMap;
		private static boolean isColorExact(Color color, int r, int g, int b) {
			return color != null && color.getRed() == r && color.getGreen() == g && color.getBlue() == b;
		}
		public static void main(String[] args) {
			try {
				if (!isColorExact(INSTANCE.getcolor("Red"), 0xFF, 0, 0)) throw new InvalidDataException();
				if (!isColorExact(INSTANCE.getcolor("Aquamarine"), 0x70, 0xDB, 0x93)) throw new InvalidDataException();
				if (!isColorExact(INSTANCE.getcolor("Green Yellow"), 0x93, 0xDB, 0x70)) throw new InvalidDataException();
				if (!isColorExact(INSTANCE.getcolor("Turquoise"), 0xAD, 0xEA, 0xEA)) throw new InvalidDataException();
			} catch (InvalidDataException e) {
				e.printStackTrace();
			}
		}
		public UbqUtils() {
			colorMap = new TreeMap<String, Color>();
			
			addColor("Red", 0xFF, 0, 0);
			addColor("Green", 0, 0xFF, 0);
			addColor("Blue", 0, 0, 0xFF);
			addColor("Aquamarine", 0x70, 0xDB, 0x93);
			addColor("Baker's Chocolate", 0x5C, 0x33, 0x17);
			addColor("Black", 0x00, 0x00, 0x00);
			addColor("Blue", 0x00, 0x00, 0xFF);
			addColor("Brass", 0xB5, 0xA6, 0x42);
			addColor("Bright Gold", 0xD9, 0xD9, 0x19);
			addColor("Brown", 0xA6, 0x2A, 0x2A);
			addColor("Bronze", 0x8C, 0x78, 0x53);
			addColor("Gold", 0xCD, 0x7F, 0x32);
			addColor("Grey", 0xC0, 0xC0, 0xC0);
			addColor("Green", 0x00, 0xFF, 0x00);
			addColor("Copper", 0xB8, 0x73, 0x33);
			addColor("Coral", 0xFF, 0x7F, 0x00);
			addColor("Cyan", 0x00, 0xFF, 0xFF);
			addColor("Dark Green", 0x2F, 0x4F, 0x2F);
			addColor("Green Yellow", 0x93, 0xDB, 0x70);
			addColor("Magenta",0xFF, 0x00, 0xFF);
			addColor("Maroon", 0x8E, 0x23, 0x6B);
			addColor("Medium Blue", 0x32, 0x32, 0xCD);
			addColor("Sienna", 0x8E, 0x6B, 0x23);
			addColor("Silver", 0xE6, 0xE8, 0xFA);
			addColor("Salmon", 0x6F, 0x42, 0x42);
			addColor("Orange", 0xFF, 0x7F, 0x00);
			addColor("Pink", 0xBC, 0x8F, 0x8F);
			addColor("Red", 0xFF, 0x00, 0x00);
			addColor("Summer Sky", 0x5C, 0x33, 0x17);
			addColor("Tan", 0xDB, 0x93, 0x70);
			addColor("Thistle", 0xD8, 0xBF, 0xD8);
			addColor("Turquoise", 0xAD, 0xEA, 0xEA);
			addColor("Very Dark Brown", 0x5C, 0x40, 0x33);
			addColor("Very Light Grey", 0xCD, 0xCD, 0xCD);
			addColor("Violet", 0x4F, 0x2F, 0x4F);
			addColor("Violet Red", 0xCC, 0x32, 0x99);
			addColor("Wheat", 0xD8, 0xD8, 0xBF);
			addColor("White", 0xFF, 0xFF, 0xFF);
			addColor("Yellow", 0xFF, 0xFF, 0x00);
			addColor("Yellow Green", 0x99, 0xCC, 0x32);
			addColor("Dark Yellow", 0x99, 0xCC, 0x32);
			addColor("Bronze II", 0xA6, 0x7D, 0x3D);
			addColor("Cadet Blue", 0x5F, 0x9F, 0x9F);
		    addColor("Cool Copper", 0xD9, 0x87, 0x19);
			addColor("Corn Flower Blue", 0x42, 0x42, 0x6F);
			addColor("Dark Brown", 0x5C, 0x40, 0x33);
			addColor("Dark Green Copper", 0x4A, 0x76, 0x6E);
			addColor("Dark Olive Green", 0x4F, 0x4F, 0x2F);
			addColor("Dark Orchid", 0x99, 0x32, 0xCD);
			addColor("Dark Purple", 0x87, 0x1F, 0x78);
			addColor("Dark Slate Blue",0x6B, 0x23, 0x8E);
			addColor("Dark Slate Grey", 0x2F, 0x4F, 0x4F);
			addColor("Dark Tan",0x97, 0x69, 0x4F);
			addColor("Dark Turquoise", 0x70, 0x93, 0xDB);
			addColor("Dark Wood",0x85, 0x5E, 0x42);
			addColor("Dim Grey", 0x54, 0x54, 0x54);
			addColor("Dusty Rose", 0x85, 0x63, 0x63);
			addColor("Feldspar", 0xD1, 0x92, 0x75);
			addColor("Firebrick", 0x8E, 0x23, 0x23);
			addColor("Forest Green",  0x23, 0x8E, 0x23);
			addColor("Goldenrod", 0xDB, 0xDB, 0x70);
			addColor("Green Copper", 0x52, 0x7F, 0x76);
			addColor("Hunter Green", 0x21, 0x5E, 0x21);
			addColor("Indian Red", 0x4E, 0x2F, 0x2F);
			addColor("Khaki", 0x9F, 0x9F, 0x5F);
			addColor("Light Blue", 0xC0, 0xD9, 0xD9);
			addColor("Light Grey", 0xA8, 0xA8, 0xA8);
			addColor("Light Steel Blue", 0x8F, 0x8F, 0xBD);
			addColor("Light Wood", 0xE9, 0xC2, 0xA6);
			addColor("Lime Green", 0x5C, 0x33, 0x17);
			addColor("Mandarian Orange", 0xE4, 0x78, 0x33);
			addColor("Medium Aquamarine", 0x5C, 0x33, 0x17);
			addColor("Medium Forest Green", 0x6B, 0x8E, 0x23);
			addColor("Medium Goldenrod", 0xEA, 0xEA, 0xAE);
			addColor("Medium Orchid", 0x93, 0x70, 0xDB);
			addColor("Medium Sea Green", 0x42, 0x6F, 0x42);
			addColor("Medium Slate Blue",0x7F, 0x00, 0xFF);
			addColor("Medium Spring Green",0x7F, 0xFF, 0x00);
			addColor("Medium Turquoise", 0x70, 0xDB, 0xDB);
			addColor("Medium Violet Red", 0xDB, 0x70, 0x93);
			addColor("Medium Wood", 0xA6, 0x80, 0x64);
			addColor("Midnight Blue", 0x2F, 0x2F, 0x4F);
			addColor("Navy Blue", 0x23, 0x23, 0x8E);
			addColor("Neon Blue", 0x4D, 0x4D, 0xFF);
			addColor("Neon Pink", 0xFF, 0x6E, 0xC7);
			addColor("New Midnight Blue", 0x00, 0x00, 0x9C);
			addColor("New Tan", 0xEB, 0xC7, 0x9E);
			addColor("Old Gold", 0xCF, 0xB5, 0x3B);
			addColor("Orange Red", 0xFF, 0x24, 0x00);
			addColor("Orchid", 0xDB, 0x70, 0xDB);
			addColor("Pale Green", 0x8F, 0xBC, 0x8F);
			addColor("Plum", 0xEA, 0xAD, 0xEA);
			addColor("Quartz", 0xD9, 0xD9, 0xF3);
			addColor("Rich Blue", 0x59, 0x59, 0xAB);
			addColor("Scarlet", 0x8C, 0x17, 0x17);
			addColor("Sea Green", 0x5C, 0x33, 0x17);
			addColor("Semi-Sweet Chocolate", 0x5C, 0x33, 0x17);
			addColor("Sky Blue",0x32, 0x99, 0xCC);
			addColor("Slate Blue", 0x00, 0x7F, 0xFF);
			addColor("Spicy Pink", 0xFF, 0x1C, 0xAE);
			addColor("Spring Green", 0x00, 0xFF, 0x7F);
			addColor("Steel Blue", 0x23, 0x6B, 0x8E);
		}
		
		public Color getcolor(String name) {
			for(String str : colorMap.keySet()) {
				if (str.equalsIgnoreCase(name)) return colorMap.get(str);
				if (str.endsWith("#"+name)) return colorMap.get(str);
				if (str != null && str.contains("#")) {
					String code = str.split("#")[1];
					if (code.equalsIgnoreCase(name)) return colorMap.get(str);
				}
			}
			return null;
		}
		public Color addColor(String code, UbqColor c) {
			return addColor(code, c.getR(), c.getG(), c.getB());
		}
		public Color addColor(String code, int r, int g, int b) {
			String k = r+"_"+g+"_"+b;
			for(String str : colorMap.keySet()) {
				if (str != null && str.contains("#")) { 
					if (str.equals(k+"#"+code)) { 
						return colorMap.get(str);
					} else if (str.equals(k+"#anonymous")) {
						return colorMap.put(k+"#"+code, colorMap.get(str));
					}
				}
			}
			return colorMap.put(k+"#"+code, new Color(Display.getDefault(), new RGB(r, g, b)));
		}
		public Color getcolor(UbqColor c) {
			if (c == null) return null;
			String k = c.getR()+"_"+c.getG()+"_"+c.getB();
			for(String str : colorMap.keySet()) {
				if ((k+"#anonymous").equals(str) || str.startsWith(k+"#")) {
					return colorMap.get(str);
				}
				if (str.contains("#")) {
					String rgb = str.split("#")[0];
					if (k.equals(rgb)) {
						return colorMap.get(str);
					}
				}
			}
			return colorMap.put(k+"#anonymous", new Color(Display.getDefault(), new RGB(c.getR(), c.getG(), c.getB())));
		}
}
