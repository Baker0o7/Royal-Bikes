herepackage com.royalbikes.app

import android.content.Context
import com.google.android.gms.location.LocationServices

class LocationService(context: Context) {
    private val client = LocationServices.getFusedLocationProviderClient(context)

    fun getLocation(callback: (Double, Double) -> Unit) {
        client.lastLocation.addOnSuccessListener {
            if (it != null) callback(it.latitude, it.longitude)
        }
    }
}
