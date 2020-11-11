/*
 * Copyright 2017 Red Hat, Inc.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.misc;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public interface JavaUtilCalendarAccess {

    /**
     * Create an empty GregorianCalendar instance.
     */
    GregorianCalendar createCalendar(TimeZone zone, Locale locale);

    /**
     * Fills in any unset fields in the calendar fields. First, the {@link
     * #computeTime()} method is called if the time value (millisecond offset
     * from the <a href="#Epoch">Epoch</a>) has not been calculated from
     * calendar field values. Then, the {@link #computeFields()} method is
     * called to calculate all calendar field values.
     *
     * @param cal the calendar to complete.
     */
    void complete(Calendar cal);
}
