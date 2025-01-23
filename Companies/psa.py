import math
import cmath

# Parameters for each T-line section
R_section = 6.85e-3  # Resistance per section in ohms
L_section = 31.5e-6  # Inductance per section in Henrys
C_section = 198.25e-6  # Capacitance per section in Farads

# Other parameters
f = 50  # Frequency in Hz
V_S = 12  # Sending end voltage in Volts
S = 100  # Total apparent power in VA

# 1. Calculate Inductive and Capacitive Reactances
X_L_section = 2 * math.pi * f * L_section
X_C_section = 1 / (2 * math.pi * f * C_section)

# 2. Calculate Series Impedance and Shunt Admittance per section
Z_section = complex(R_section, X_L_section)
Y_section = complex(0, 1/X_C_section)

# 3. Calculate ABCD parameters for one section using nominal pi model
A = 1 + (Y_section * Z_section)/2
B = Z_section
C = Y_section * (1 + (Y_section * Z_section)/4)
D = A 

# 4. Calculate overall ABCD parameters for the 2-section model
A_total = A**2 + B*C 
B_total = 2*A*B + B*D 
C_total = 2*C*A + C*D
D_total = D**2 + B*C

# 5. Calculate receiving end current (I_R) assuming purely resistive load
# We need to first calculate the receiving end voltage (V_R)
V_R = (V_S + cmath.sqrt(V_S**2 - 4 * A_total * B_total * S)) / (2 * A_total)

I_R = S / V_R

# 6. Calculate sending end current (I_S)
I_S = C_total * V_R + D_total * I_R

# 7. Calculate Input Power (S_in)
S_in = V_S * I_S.conjugate()

# 8. Calculate Efficiency
Efficiency = (S / S_in.real) * 100

# 9. Calculate Voltage Regulation
Voltage_Regulation = ((abs(V_S) - abs(V_R)) / abs(V_R)) * 100

# Print overall efficiency and voltage regulation
print(f"Overall Efficiency for 2 sections: {Efficiency:.2f}%")
print(f"Voltage Regulation: {Voltage_Regulation:.2f}%")