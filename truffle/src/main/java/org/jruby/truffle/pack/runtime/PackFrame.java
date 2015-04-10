/*
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.jruby.truffle.pack.runtime;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotKind;

public class PackFrame {

    public static final PackFrame INSTANCE = new PackFrame();

    private FrameDescriptor frameDescriptor;
    private FrameSlot sourceSlot;
    private FrameSlot sourceLengthSlot;
    private FrameSlot sourcePositionSlot;
    private FrameSlot outputSlot;
    private FrameSlot outputPositionSlot;
    private FrameSlot taintSlot;

    private PackFrame() {
        frameDescriptor = new FrameDescriptor();
        sourceSlot = frameDescriptor.addFrameSlot("source", FrameSlotKind.Object);
        sourceLengthSlot = frameDescriptor.addFrameSlot("source-length", FrameSlotKind.Int);
        sourcePositionSlot = frameDescriptor.addFrameSlot("source-position", FrameSlotKind.Int);
        outputSlot = frameDescriptor.addFrameSlot("output", FrameSlotKind.Object);
        outputPositionSlot = frameDescriptor.addFrameSlot("output-position", FrameSlotKind.Int);
        taintSlot = frameDescriptor.addFrameSlot("taint", FrameSlotKind.Boolean);
    }

    public FrameDescriptor getFrameDescriptor() {
        return frameDescriptor;
    }

    public FrameSlot getSourceSlot() {
        return sourceSlot;
    }

    public FrameSlot getSourceLengthSlot() {
        return sourceLengthSlot;
    }

    public FrameSlot getSourcePositionSlot() {
        return sourcePositionSlot;
    }

    public FrameSlot getOutputSlot() {
        return outputSlot;
    }

    public FrameSlot getOutputPositionSlot() {
        return outputPositionSlot;
    }

    public FrameSlot getTaintSlot() {
        return taintSlot;
    }

}
