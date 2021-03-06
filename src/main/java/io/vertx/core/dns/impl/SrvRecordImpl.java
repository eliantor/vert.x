/*
 * Copyright (c) 2011-2013 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.core.dns.impl;

import io.vertx.core.dns.SrvRecord;


/**
 * @author <a href="mailto:nmaurer@redhat.com">Norman Maurer</a>
 */
public final class SrvRecordImpl implements SrvRecord, Comparable<SrvRecord>{

  private final int priority;
  private final int weight;
  private final int port;
  private final String name;
  private final String protocol;
  private final String service;
  private final String target;

  public SrvRecordImpl(int priority, int weight, int port, String name, String protocol, String service, String target) {
    this.priority = priority;
    this.weight = weight;
    this.port = port;
    this.name = name;
    this.protocol = protocol;
    this.service = service;
    this.target = target;
  }

  @Override
  public int priority() {
    return priority;
  }

  @Override
  public int weight() {
    return weight;
  }

  @Override
  public int port() {
    return port;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String protocol() {
    return protocol;
  }

  @Override
  public String service() {
    return service;
  }

  @Override
  public String target() {
    return target;
  }

  @Override
  public int compareTo(SrvRecord o) {
    return Integer.valueOf(priority()).compareTo(o.priority());
  }
}
