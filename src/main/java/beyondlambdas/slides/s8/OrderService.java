/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package beyondlambdas.slides.s8;

import java.util.concurrent.atomic.AtomicLong;

import static se.sawano.java.commons.lang.validate.Validate.notNull;

class OrderService {

    private final AtomicLong sentOrders = new AtomicLong();

    public void sendOrder(final Order order) {
        notNull(order);

        //Send to order management system...
        sentOrders.incrementAndGet();
    }

    public long sentOrders() {
        return sentOrders.get();
    }
}
