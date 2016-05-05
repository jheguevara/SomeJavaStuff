package com.descriptor.javautils;

import java.lang.reflect.*;
import java.util.*;

public class Java2UML
{
    public static void main (String args[])
    {
      // check for proper arguments
        if ( args.length != 1 )
        {
            System.out.println ( "Usage Java2UML classname" );
            System.exit ( 0 );
        }

        ArrayList methodList = new ArrayList();

        try
        {

          // retrieve methods
            Class cls = Class.forName ( args[0] );
            Method[] methods = cls.getDeclaredMethods();

          // process methods
            for ( int i = 0; i < methods.length; i++ )
            {
                Method method = methods[i];

                int mods = method.getModifiers();
                if ( Modifier.isPublic ( mods ) ||
                     Modifier.isProtected ( mods ) )
                {
                    StringBuffer sb = new StringBuffer ( method.getName() );
                    sb.append ( "(" );

                    Class[] parmTypes = method.getParameterTypes();
                    for ( int j = 0; j < parmTypes.length; j++ )
                    {
                        sb.append ( "arg" + j + ":" );
                        String classname = parmTypes[j].getName();
                        sb.append ( stripPackages ( classname ) );

                        if ( j != parmTypes.length - 1 )
                        {
                            sb.append ( ", " );
                        }
                    }

                    sb.append ( "):" );
                    Class retClass = method.getReturnType();
                    sb.append ( stripPackages ( retClass.getName() ) );

                    //System.out.println ( sb );
                    methodList.add ( new String ( sb ) );
                }
            }

          // sort the list
            Collections.sort ( methodList );

          // display the method list
            Iterator iter = methodList.iterator();
            while ( iter.hasNext() )
            {
                System.out.println ( iter.next() );
            }
        }
        catch ( Exception exc )
        {
            System.out.println ( "Error: " + exc );
            exc.printStackTrace();
        }
    }

    public static String stripPackages ( String classname )
    {
        int index = classname.lastIndexOf ( '.' );
        if ( index != -1 )
        {
            return classname.substring ( index + 1 );
        }
        else
            return classname;
    }
}
