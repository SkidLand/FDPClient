package net.ccbluex.liquidbounce.features.module.modules.movement.speeds.verus

import net.ccbluex.liquidbounce.features.module.modules.movement.speeds.SpeedMode
import net.ccbluex.liquidbounce.utils.MovementUtils

class VulcanHop2 : SpeedMode("VulcanHop2") {
    override fun onPreMotion() {
        if (MovementUtils.isMoving()) {
           mc.timer.timerSpeed = if (mc.thePlayer.motionY > 0) { 1.35 } else { 0.8 }
            if (mc.thePlayer.onGround) {
                mc.thePlayer.jump()
                MovementUtils.strafe()
            }
        } else {
            mc.thePlayer.motionX = 0.0
            mc.thePlayer.motionZ = 0.0
        }
    }
}
