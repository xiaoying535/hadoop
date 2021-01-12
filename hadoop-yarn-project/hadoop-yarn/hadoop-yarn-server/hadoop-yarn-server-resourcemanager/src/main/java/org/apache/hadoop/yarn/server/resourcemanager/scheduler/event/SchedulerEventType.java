/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.yarn.server.resourcemanager.scheduler.event;

public enum SchedulerEventType {

  // Source: Node
  NODE_ADDED,//集群中增加一个节点
  NODE_REMOVED,//集群中移除一个节点
  NODE_UPDATE,//该时间是NodeManager通过心跳和ResourceManager通信时发送的，会汇报该node的资源使用情况，同时出发一次分配操作
  NODE_RESOURCE_UPDATE,//集群中有一个节点的资源增加了
  NODE_LABELS_UPDATE,//更新node labels。node labels可以用于划分一个cluster的node，每个node可以有一个label

  // Source: RMApp
  APP_ADDED,//增加一个Application
  APP_REMOVED,//移除一个application

  // Source: RMAppAttempt
  APP_ATTEMPT_ADDED,//增加一个application Attempt
  APP_ATTEMPT_REMOVED,//移除一个application attempt

  // Source: ContainerAllocationExpirer
  CONTAINER_EXPIRED,//回收一个超时的container

  // Source: SchedulerAppAttempt::pullNewlyUpdatedContainer.
  RELEASE_CONTAINER,

  /* Source: SchedulingEditPolicy */
  KILL_RESERVED_CONTAINER,

  // Mark a container for preemption
  MARK_CONTAINER_FOR_PREEMPTION,

  // Mark a for-preemption container killable
  MARK_CONTAINER_FOR_KILLABLE,

  // Cancel a killable container
  MARK_CONTAINER_FOR_NONKILLABLE,

  //Queue Management Change
  MANAGE_QUEUE
}
