// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

package com.microsoft.signalr;

@FunctionalInterface
public interface Action7<T1, T2, T3, T4, T5, T6, T7> {
    void invoke(T1 param1, T2 param2, T3 param3, T4 param4, T5 param5, T6 param6, T7 param7);
}
