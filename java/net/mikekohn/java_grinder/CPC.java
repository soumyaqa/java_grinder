/**
 *  Java Grinder
 *  Author: Michael Kohn
 *   Email: mike@mikekohn.net
 *     Web: http://www.naken.cc/
 * License: GPL
 *
 * Copyright 2014-2016 by Michael Kohn
 *
 * CPC support by Carsten Dost  - https://github.com/deringenieur71
 *
 */

package net.mikekohn.java_grinder;

abstract public class CPC
{

  protected CPC() { }

  public static void beep() { }
  public static void color(int foreground,int background,int border) { }
  public static void cls() { }
  public static void screen(int mode) { }
  public static void putChar(char c) { }
  public static void setCursor(int column,int line) { }
  public static void plot(int x,int y,int foreground) { }
  public static void draw(int x,int y,int foreground) { }
}


