package com.gatehill.slackgateway.backend.slack.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class UsersListResponse(
    override val ok: Boolean,
    val members: List<SlackUser>
) : ResponseWithStatus
