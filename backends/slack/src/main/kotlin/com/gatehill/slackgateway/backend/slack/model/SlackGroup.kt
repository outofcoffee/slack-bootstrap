package com.gatehill.slackgateway.backend.slack.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * This is actually a private channel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class SlackGroup(
    override val id: String,
    override val name: String,
    override val members: List<String>
) : SlackChannel
