package net.ccbluex.liquidbounce.features.module.modules.movement.flys.verus

import net.ccbluex.liquidbounce.event.EventState
import net.ccbluex.liquidbounce.event.MotionEvent
import net.ccbluex.liquidbounce.event.PacketEvent
import net.ccbluex.liquidbounce.features.module.modules.movement.flys.FlyMode
import net.ccbluex.liquidbounce.utils.ClientUtils
import net.ccbluex.liquidbounce.value.BoolValue
import net.minecraft.network.play.client.C03PacketPlayer.C04PacketPlayerPosition
import net.minecraft.network.play.client.C03PacketPlayer.C06PacketPlayerPosLook
import net.minecraft.network.play.server.S08PacketPlayerPosLook
import kotlin.math.cos
import kotlin.math.sin

class VulcanGlideFly : FlyMode("Vulcan-Glide") {

    private var ticks = 0

    override fun onMotion(event: MotionEvent) {
        if (event.eventState == EventState.PRE) {
            mc.timer.timerSpeed = 1f
            mc.thePlayer.motionY = -if(ticks % 2 == 0) {
                0.17
            } else {
                0.10
            }
            if(ticks == 0) {
                mc.thePlayer.motionY = -0.07
            }
            ticks++
     }
