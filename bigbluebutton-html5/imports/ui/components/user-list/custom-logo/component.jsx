import React from 'react';
import { styles } from './styles';

const CustomLogo = ({ CustomLogoUrl }) => (
  <div>
    <div className={styles.branding}>
      <img src={CustomLogoUrl} alt="custom branding logo" />
    </div>
  </div>
);

export default CustomLogo;
