package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/LocatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Friday, April 10, 2015 11:20:47 AM PDT
*/

public final class LocatorHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.Locator value = null;

  public LocatorHolder ()
  {
  }

  public LocatorHolder (com.sun.corba.se.spi.activation.Locator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.LocatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.LocatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.LocatorHelper.type ();
  }

}