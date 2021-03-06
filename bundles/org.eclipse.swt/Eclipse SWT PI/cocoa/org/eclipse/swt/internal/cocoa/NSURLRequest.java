/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.cocoa;

public class NSURLRequest extends NSObject {

public NSURLRequest() {
	super();
}

public NSURLRequest(long /*int*/ id) {
	super(id);
}

public NSURLRequest(id id) {
	super(id);
}

public NSURL URL() {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_URL);
	return result != 0 ? new NSURL(result) : null;
}

public NSURLRequest initWithURL(NSURL URL) {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_initWithURL_, URL != null ? URL.id : 0);
	return result == this.id ? this : (result != 0 ? new NSURLRequest(result) : null);
}

public static NSURLRequest requestWithURL(NSURL URL) {
	long /*int*/ result = OS.objc_msgSend(OS.class_NSURLRequest, OS.sel_requestWithURL_, URL != null ? URL.id : 0);
	return result != 0 ? new NSURLRequest(result) : null;
}

}
