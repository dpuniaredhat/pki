// --- BEGIN COPYRIGHT BLOCK ---
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; version 2 of the License.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License along
// with this program; if not, write to the Free Software Foundation, Inc.,
// 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
//
// (C) 2018 Red Hat, Inc.
// All rights reserved.
// --- END COPYRIGHT BLOCK ---
package com.netscape.cmscore.apps;

import com.netscape.certsrv.base.ISubsystem;

public class SubsystemInfo {

    public String id;
    public ISubsystem instance;
    public boolean enabled;
    public boolean updateIdOnInit;

    public SubsystemInfo(String id, ISubsystem instance) {
        this(id, instance, true, false);
    }

    public SubsystemInfo(String id, ISubsystem instance, boolean enabled, boolean updateIdOnInit) {
        this.id = id;
        this.instance = instance;
        this.enabled = enabled;
        this.updateIdOnInit = updateIdOnInit;
    }
}
