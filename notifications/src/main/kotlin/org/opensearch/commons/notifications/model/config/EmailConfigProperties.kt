/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 *
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package org.opensearch.commons.notifications.model.config

import org.opensearch.common.io.stream.Writeable
import org.opensearch.common.xcontent.XContentParser
import org.opensearch.commons.notifications.NotificationConstants
import org.opensearch.commons.notifications.model.ConfigType
import org.opensearch.commons.notifications.model.Email

object EmailConfigProperties : ConfigDataProperties {

    /**
     * {@inheritDoc}
     */
    override fun getChannelTag(): String {
        return NotificationConstants.EMAIL_TAG
    }

    /**
     * {@inheritDoc}
     */
    override fun getConfigDataReader(): Writeable.Reader<Email> {
        return Email.reader
    }

    /**
     * {@inheritDoc}
     */
    override fun createConfigData(parser: XContentParser): Email {
        return Email.parse(parser)
    }

    /**
     * {@inheritDoc}
     */
    override fun getConfigType(): ConfigType {
        return ConfigType.Email
    }
}