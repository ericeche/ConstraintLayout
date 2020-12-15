package com.frogzilla;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SettingsPhysics extends Activity {

    private RadioGroup mRadioGGravity;
    private RadioGroup mRadioGTableSpeed;
    private RadioGroup mRadioGMass;
    private RadioGroup mRadioGFriction;
    private RadioGroup mRadioGRestitution;
    private RadioGroup mRadioGLinearDamping;
    private RadioGroup mRadioGAngularDamping;
    private RadioGroup mRadioGSweepSphere;
    private SharedPreferences app_preferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physicssettingsconstraint);

        mRadioGGravity = (RadioGroup) findViewById(R.id.radioGGravity);
        mRadioGTableSpeed = (RadioGroup) findViewById(R.id.radioGFriction);
        mRadioGMass = (RadioGroup) findViewById(R.id.radioGMass);
        mRadioGFriction = (RadioGroup) findViewById(R.id.radioGFriction);
        mRadioGRestitution = (RadioGroup) findViewById(R.id.radioGRestitution);
        mRadioGLinearDamping = (RadioGroup) findViewById(R.id.radioGLinearDamping);
        mRadioGAngularDamping = (RadioGroup) findViewById(R.id.radioGAngulardamping);
        mRadioGSweepSphere = (RadioGroup) findViewById(R.id.radioGSweepSphere);


        app_preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        editor = app_preferences.edit();

        mRadioGGravity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int mCheckedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(mCheckedId);
                if (mCheckedId == R.id.r1) {
                    editor.putInt("GRAVITY",1);
                } else if (mCheckedId == R.id.r2) {
                    editor.putInt("GRAVITY",2);
                } else if (mCheckedId == R.id.r3) {
                    editor.putInt("GRAVITY",3);
                }

            }
        });

        mRadioGTableSpeed.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int mCheckedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(mCheckedId);
                if (mCheckedId == R.id.r4) {
                    editor.putInt("TABLE_SPEED",1);
                } else if (mCheckedId == R.id.r5) {
                    editor.putInt("TABLE_SPEED",2);
                } else if (mCheckedId == R.id.r6) {
                    editor.putInt("TABLE_SPEED",3);
                }
            }
        });


        mRadioGMass.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int mCheckedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(mCheckedId);
                if (mCheckedId == R.id.r7) {
                    editor.putInt("MASS",1);
                } else if (mCheckedId == R.id.r8) {
                    editor.putInt("MASS",2);
                } else if (mCheckedId == R.id.r9) {
                    editor.putInt("MASS",3);
                }
            }
        });

        mRadioGFriction.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int mCheckedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(mCheckedId);
                if (mCheckedId == R.id.r10) {
                    editor.putInt("FRICTION",1);
                } else if (mCheckedId == R.id.r11) {
                    editor.putInt("FRICTION",2);
                } else if (mCheckedId == R.id.r12) {
                    editor.putInt("FRICTION",3);
                }
            }
        });

        mRadioGRestitution.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int mCheckedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(mCheckedId);
                if (mCheckedId == R.id.r13) {
                    editor.putInt("RESTITUTION",1);
                } else if (mCheckedId == R.id.r14) {
                    editor.putInt("RESTITUTION",2);
                } else if (mCheckedId == R.id.r15) {
                    editor.putInt("RESTITUTION",3);
                }
            }
        });

        mRadioGLinearDamping.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int mCheckedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(mCheckedId);
                if (mCheckedId == R.id.r16) {
                    editor.putInt("LINEAR_DAMPING",1);
                } else if (mCheckedId == R.id.r17) {
                    editor.putInt("LINEAR_DAMPING",2);
                } else if (mCheckedId == R.id.r18) {
                    editor.putInt("LINEAR_DAMPING",3);
                }
            }
        });

        mRadioGAngularDamping.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int mCheckedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(mCheckedId);
                if (mCheckedId == R.id.r19) {
                    editor.putInt("ANGULAR_DAMPING",1);
                } else if (mCheckedId == R.id.r20) {
                    editor.putInt("ANGULAR_DAMPING",2);
                } else if (mCheckedId == R.id.r21) {
                    editor.putInt("ANGULAR_DAMPING",3);
                }
            }
        });


        mRadioGSweepSphere.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int mCheckedId)
            {
                // This will get the radiobutton that has changed in its check state
                RadioButton checkedRadioButton = (RadioButton)group.findViewById(mCheckedId);
                if (mCheckedId == R.id.r22) {
                    editor.putInt("SWEEPSPHERERADIUS",1);
                } else if (mCheckedId == R.id.r23) {
                    editor.putInt("SWEEPSPHERERADIUS",2);
                } else if (mCheckedId == R.id.r24) {
                    editor.putInt("SWEEPSPHERERADIUS",3);
                }
            }
        });





    }







}


