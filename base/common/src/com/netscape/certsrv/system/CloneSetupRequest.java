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
// (C) 2012 Red Hat, Inc.
// All rights reserved.
// --- END COPYRIGHT BLOCK ---
package com.netscape.certsrv.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author alee
 *
 */
@XmlRootElement(name="CloneSetupRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class CloneSetupRequest {

    @XmlElement
    protected String pin;

    @XmlElement
    protected DomainInfo domainInfo;

    @XmlElement
    protected InstallToken installToken;

    @XmlElement
    protected String cloneUri;

    @XmlElement
    protected Boolean systemCertsImported;

    public CloneSetupRequest() {
        // required for JAXB
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public DomainInfo getDomainInfo() {
        return domainInfo;
    }

    public void setDomainInfo(DomainInfo domainInfo) {
        this.domainInfo = domainInfo;
    }

    public InstallToken getInstallToken() {
        return installToken;
    }

    public void setInstallToken(InstallToken installToken) {
        this.installToken = installToken;
    }

    public String getCloneUri() {
        return cloneUri;
    }

    public void setCloneUri(String cloneUri) {
        this.cloneUri = cloneUri;
    }

    public Boolean getSystemCertsImported() {
        return systemCertsImported;
    }

    public void setSystemCertsImported(Boolean systemCertsImported) {
        this.systemCertsImported = systemCertsImported;
    }

    @Override
    public String toString() {
        return "CloneSetupRequest [pin=XXXX" +
               ", installToken=XXXX" +
               ", cloneUri=" + cloneUri +
               ", systemCertsImported=" + systemCertsImported +
               "]";
    }
}