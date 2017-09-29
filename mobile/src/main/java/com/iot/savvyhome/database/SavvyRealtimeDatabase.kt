package com.iot.savvyhome.database

import android.util.Log

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.iot.savvyhome.helper.SavvyConstants

import android.content.ContentValues.TAG

/**
 * Created by angad.tiwari on 29-Sep-17.
 */

class SavvyRealtimeDatabase : ValueEventListener {
    init {
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReferenceFromUrl(SavvyConstants.SAVVY_FIREBASE_DB_REF)
        myRef.addValueEventListener(this)
    }

    override fun onDataChange(dataSnapshot: DataSnapshot) {
        // This method is called once with the initial value and again
        // whenever data at this location is updated.
        Log.d(TAG, "Value is: " + dataSnapshot)
    }

    override fun onCancelled(databaseError: DatabaseError) {
        // Failed to read value
        Log.w(TAG, "Failed to read value.", databaseError.toException())
    }
}
