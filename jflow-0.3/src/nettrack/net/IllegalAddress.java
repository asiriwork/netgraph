/**
 * Copyright (C) 2000-2007 Oliver Hitz <oliver@net-track.ch>
 *
 * $Id: IllegalAddress.java,v 1.2 2007-04-24 13:24:53 oli Exp $
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later
 * version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package nettrack.net;

public class IllegalAddress extends Exception
{
  protected String message;

  protected IllegalAddress()
  {
  }

  public IllegalAddress(String m)
  {
    message = m;
  }

  public String getMessage()
  {
    return message;
  }
}
